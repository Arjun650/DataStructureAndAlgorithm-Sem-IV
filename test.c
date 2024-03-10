#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>
int main()
{
    int pid; 
    printf("From parent");
    pid = fork();
    printf("Child created");
    return 0;
}
