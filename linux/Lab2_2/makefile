CC = gcc
CFLAGS = -Wall

all: execve1 execve2 execve3

execve1: execve1.o
	$(CC) -o execve1 execve1.o

execve1.o: execve1.c
	$(CC) $(CFLAGS) -E execve1.c -o execve1.i
	$(CC) $(CFLAGS) -S execve1.i -o execve1.s
	$(CC) $(CFLAGS) -c execve1.s -o execve1.o
	
execve2: execve2.o
	$(CC) -o execve2 execve2.o

execve2.o: execve2.c
	$(CC) $(CFLAGS) -E execve2.c -o execve2.i
	$(CC) $(CFLAGS) -S execve2.i -o execve2.s
	$(CC) $(CFLAGS) -c execve2.s -o execve2.o

execve3: execve3.o
	$(CC) -o execve3 execve3.o

execve3.o: execve3.c
	$(CC) $(CFLAGS) -E execve3.c -o execve3.i
	$(CC) $(CFLAGS) -S execve3.i -o execve3.s
	$(CC) $(CFLAGS) -c execve3.s -o execve3.o

clean:
	rm -f *.o *.i *.s execve1 execve2 execve3
