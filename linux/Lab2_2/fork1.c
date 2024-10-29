#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>

int main(void) {
    pid_t pid;
    int counter = 5; // Количество проходов по циклу
    
    for (int i = 0; i < counter; i++) {
        pid = fork();
        if (pid == 0) { // Дочерний процесс
            printf("I'm child with PID=%d\n", getpid());
            execlp("/bin/ps", "ps", NULL); // Выполнение команды ps
            exit(0);
        }
    }
    
    sleep(5); // Родительский процесс ждет 5 секунд
    printf("Parent process ends.\n");
    return 0;
}

