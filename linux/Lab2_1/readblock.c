#include <stdio.h>
#include <unistd.h>
#include <fcntl.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <getopt.h>
#include <stdlib.h>

// Макрос ARR_SIZE() вычисляет на стадии компиляции размер статического массива.
#define ARR_SIZE(array) (sizeof(array) / sizeof(array[0]))

int main(int argc, char **argv) {
    int i, opt, nflag = 0;
    char ch;
    off_t pos;
    size_t count;

    // Строки для вывода информационных сообщений
    char help_str[] = "Usage: readblock OPTIONS FILENAME\n"
                      "OPTIONS:\n"
                      "-h, --help\n"
                      "-o, --output <filename>\n"
                      "-p, --position <number>\n"
                      "-c, --count <number>\n"
                      "-n, --newline\n";
    char unkn_emsg[] = "Unknown error\n";
    char ifile_emsg[] = "Cannot open input file\n";
    char ofile_emsg[] = "Cannot open output file\n";
    char lseek_emsg[] = "Cannot set I/O position\n";

    char *ofname = NULL;
    char *pos_str = NULL;
    char *count_str = NULL;

    const struct option long_opts[] = {
        {"help", no_argument, NULL, 'h'},
        {"output", required_argument, NULL, 'o'},
        {"position", required_argument, NULL, 'p'},
        {"count", required_argument, NULL, 'c'},
        {"newline", no_argument, NULL, 'n'},
        {NULL, 0, NULL, 0}
    };

    while ((opt = getopt_long(argc, argv, "ho:p:c:n", long_opts, NULL)) != -1) {
        switch (opt) {
            case 'h':
                write(1, help_str, ARR_SIZE(help_str));
                return 0;
            case 'o':
                ofname = optarg;
                break;
            case 'p':
                pos_str = optarg;
                break;
            case 'c':
                count_str = optarg;
                break;
            case 'n':
                nflag = 1;
                break;
            case '?':
                write(2, help_str, ARR_SIZE(help_str));
                return 1;
            default:
                write(2, unkn_emsg, ARR_SIZE(unkn_emsg));
                return 2;
        }
    }

    if (count_str == NULL) {
        write(2, help_str, ARR_SIZE(help_str));
        return 3;
    }

    count = abs(atoi(count_str));
    if (pos_str != NULL) {
        pos = abs(atoi(pos_str));
    } else {
        pos = 0;
    }

    if (optind >= argc) {
        write(2, help_str, ARR_SIZE(help_str));
        return 4;
    }

    // Открытие входного файла с использованием буферизации
    FILE *ifp = fopen(argv[optind], "r");
    if (ifp == NULL) {
        write(2, ifile_emsg, ARR_SIZE(ifile_emsg));
        return 6;
    }

    // Открытие выходного файла с использованием буферизации
    FILE *ofp = (ofname != NULL) ? fopen(ofname, "w") : stdout;
    if (ofname != NULL && ofp == NULL) {
        write(2, ofile_emsg, ARR_SIZE(ofile_emsg));
        fclose(ifp);
        return 5;
    }

    // Установка позиции для чтения
    if (fseeko(ifp, 0, SEEK_END) == -1 || pos > ftello(ifp)) {
        count = 0;
    } else if (fseeko(ifp, pos, SEEK_SET) == -1) {
        write(2, lseek_emsg, ARR_SIZE(lseek_emsg));
        fclose(ifp);
        if (ofp != stdout) fclose(ofp);
        return 7;
    }

    // Чтение и запись данных через буфер
    for (i = 0; i < count; i++) {
        if (fread(&ch, 1, 1, ifp) <= 0) break;
        fwrite(&ch, 1, 1, ofp);
    }

    // Запись новой строки, если был флаг `-n`
    if (nflag) fwrite("\n", 1, 1, ofp);

    // Закрытие файлов
    fclose(ifp);
    if (ofp != stdout) fclose(ofp);

    return 0;
}
