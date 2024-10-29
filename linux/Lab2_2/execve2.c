#include <stdio.h>
#include <unistd.h>

int main(void) {
    char *newprog_args[] = {"Tee-hee!", "arg1", "arg2", NULL};
    char *newprog_envp[] = {"USER=user", "HOME=/home/school/linux/Lab2_2", NULL};
    printf("Old PID: %d\n", getpid());
    execve("./execve3", newprog_args, newprog_envp);
    fprintf(stderr, "Error\n");
    return 0;
}

