#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

void write_to_file() {
    FILE *file = fopen("shared_file.txt", "w");
    if (file == NULL) {
        perror("Failed to open file");
        exit(1);
    }
    fprintf(file, "Hello from the parent process!\n");
    fclose(file);
}

void read_from_file() {
    sleep(1); // Ждем, пока родительский процесс запишет данные
    FILE *file = fopen("shared_file.txt", "r");
    if (file == NULL) {
        perror("Failed to open file");
        exit(1);
    }
    char buffer[100];
    while (fgets(buffer, sizeof(buffer), file) != NULL) {
        printf("Child process reads: %s", buffer);
    }
    fclose(file);
}

int main(void) {
    pid_t pid = fork();
    if (pid == -1) {
        perror("Fork failed");
        exit(1);
    }
    if (pid == 0) { // Дочерний процесс
        read_from_file();
    } else { // Родительский процесс
        write_to_file();
        wait(NULL); // Ждем завершения дочернего процесса
    }
    return 0;
}

