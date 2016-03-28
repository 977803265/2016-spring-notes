#Linux程序设计

shell，高级语言和实用程序

系统调用

文件子系统，进程管理子系统{进程间通信，调度程序，存储管理}

高速缓存

字符设备 块设备 设备驱动

硬件控制

硬件


###windowsAPI是什么
对应linux下的linux系统调用。

###文件操作
ls：dir，vdir。是在windows下的。记住ls即可

mknod创建设备驱动文件，mkfifo创建管道

mv也用于重命名。cp,rm

判别编译的程序有没有改过是根据代码修改时间比二进制时间早来判别的

locate,find:查找文件。

find命令是神器。


eg:在一个目录结构下，有许多makefile文件
gsl=GNU Scientific Library
要求把所有的makefile复制到另一个目录下，并且保留原来的目录结构。

grep命令：在一个文本文件里找一个字符串。把所有找到的地方列出来。

egrep获得模式

tar解压 tar -zxvf （gz）
-jxvf(bz2)

more,less,cat    more，less显示一页

-ar：打包库文件
-file：显示文件类型

head，tail

head100一个文件头

###2
fg切到前台运行，bg切到后台后台运行，nice优先级，ps命令监测进程。

man查用户手册

who，whoami查自己的用户名。passwd改密码，su命令可能会被禁。

uname版本信息:uname -r:内核

###重定向
<,>,>>,2>

 >>是一个重定向号，是往末尾添加，而不是替换

