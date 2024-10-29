#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define ABOOK_FNAME "abooks" 
#define NAME_LENGTH 50
#define PHONE_LENGTH 30
#define EMAIL_LENGTH 30

char name_buffer[NAME_LENGTH];
char phone_buffer[PHONE_LENGTH];
char email_buffer[EMAIL_LENGTH];

void abook_failed(int retcode) {
    fprintf(stderr, "Cannot open address book\n");
    exit(retcode);
}

void abook_add(void) {
    printf("Name: "); 
    fgets(name_buffer, NAME_LENGTH, stdin);
    name_buffer[strcspn(name_buffer, "\n")] = '\0'; // Удаление символа новой строки
    printf("Phone number: "); 
    fgets(phone_buffer, PHONE_LENGTH, stdin);
    phone_buffer[strcspn(phone_buffer, "\n")] = '\0'; // Удаление символа новой строки
    printf("E-mail: "); 
    fgets(email_buffer, EMAIL_LENGTH, stdin);
    email_buffer[strcspn(email_buffer, "\n")] = '\0'; // Удаление символа новой строки

    // Используем буферизацию для записи в файл
    FILE *file = fopen(ABOOK_FNAME, "a");  // Открытие в режиме добавления (append)
    if (file == NULL) {
        abook_failed(1);
    }

    // Запись данных в файл
    fwrite(name_buffer, sizeof(char), NAME_LENGTH, file);
    fwrite(phone_buffer, sizeof(char), PHONE_LENGTH, file);
    fwrite(email_buffer, sizeof(char), EMAIL_LENGTH, file);

    fclose(file);  // Закрытие файла
}

void abook_find(void) {
    char find_buffer[NAME_LENGTH];
    printf("Name: ");
    fgets(find_buffer, NAME_LENGTH, stdin);
    find_buffer[strcspn(find_buffer, "\n")] = '\0'; // Удаление символа новой строки

    // Используем буферизацию для чтения из файла
    FILE *file = fopen(ABOOK_FNAME, "r");
    if (file == NULL) {
        abook_failed(1);
    }

    // Чтение данных из файла
    while (fread(name_buffer, sizeof(char), NAME_LENGTH, file) > 0) {
        fread(phone_buffer, sizeof(char), PHONE_LENGTH, file);
        fread(email_buffer, sizeof(char), EMAIL_LENGTH, file);

        if (strcmp(find_buffer, name_buffer) == 0) {
            printf("Phone: %s\n", phone_buffer);
            printf("E-mail: %s\n", email_buffer);
            fclose(file);  // Закрытие файла
            return;
        }
    }

    printf("Name '%s' hasn't been found\n", find_buffer);
    fclose(file);  // Закрытие файла
}

int main(int argc, char **argv) {
    if (argc < 2) {
        fprintf(stderr, "Too few arguments\n");
        return 1;
    }

    if (strcmp(argv[1], "add") == 0) {
        abook_add();
    } else if (strcmp(argv[1], "find") == 0) {
        abook_find();
    } else {
        fprintf(stderr, "%s: unknown command\nUsage: abook { add , find }\n", argv[1]);
        return 1;
    }

    return 0;
}

