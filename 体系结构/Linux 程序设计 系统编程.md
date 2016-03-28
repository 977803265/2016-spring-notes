# Linux 程序设计 系统编程

	int main()
	{
		pit_t pid; // pid_t is int
		fd = open("test.txt",O_RDWR|O_APPEND);
		if (fd == -1)
		##printf("open err/n");
		
		fcntl(fd,F_SETFD,1) //标志位，fd 不能给别的进程用，拿不到描述符，0表示拿得到描述符。所以&fd传过去也没有用
		char *s = "ooooooo";
		pid = fork();//之后会产生2个进程
		if(pid==0) //只有一个进程会执行
			execl("ass","./ass",&fd,NULL);//execl 会把当前进程的所有东西替换掉，后面的就不执行了
			
		wait(NULL);//等上面这个进程结束。所以ooooooo会被后写。
		write(fd,s,strlen(s));
		close(fd);
		
### fcntl function
	
	int fcntl(int d,int request,...)
	
	F_DUPFD
	
	F_GETFD: close-on-exec flag

O_NONBLOCK 将当前的文件描述符设置成非阻塞模式。当文件是网络/驱动接口的虚拟文件时，阻塞下里面没有文件会等。非阻塞模式下会返回一个读不到的错误，接着跑

	O_DIRECT 尽量不开缓存
	O_ASYNC linux不支持

	F_GETOWN 设置IO设备的可用性

	设置锁：F_GETLK, F_SETLK,F_SETLKW

### ioctl function

### FILE Stream
FILE* fp 文件流指针

void setbuf(FILE *stream, char *buf) //流指针，缓存位置，大小固定。固定的值在头文件里，#define BUFSIZ 。尽可能不要用栈内存。

	int setvbuf(..,..,type,unsigned size)
	type:满，行，无
	
	FILE *fopen (const char *filename,const char *mode );
	
	int fclose(FILE *filestream)
	
	mode:r,w,a,r+,w+,a+

### INPUT
int getc(FILE *fp) //它是一个宏。不用调用函数。不能副作用（不能++）。不能用函数指针指向它





