#Linux系统基础4：字符界面操作
##1.Linux字符界面

1.默认进入字符界面：
	
	ln -sf /lib/systemd/system/runlevel3.target
	/etc/systemd/system/default.target
	
	ln是创造链接， -s 软连接 -f强制
	
	
2.man 帮助
	
	man(5) passwd	
	
3.whereis，

env命令，会发现PATH=。。。。这里是搜索的路径

通配符

tab键自动补全

ctrl+R，执行以前使用过的命令。按回车立刻执行，按光标右键定位到命令上。

more命令：有多屏的情况。第一屏会停掉。

###重定向
不在屏幕上显示，重定向到一个文件中。
ls/boot > root/abc
commandname > filepath

输入重定向
command < file

错误重定向
command 2> /root/b


#VIM
vi编辑器，命令行模式

ZZ保存退出，ZQ

冒号进入末行模式。