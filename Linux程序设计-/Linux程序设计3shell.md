# Linux程序设计3 shell

- read 命令
  - -t 参数倒计时，-s默读，不会回显密码
- REPLY variable

- 引号：
  - 如果echo '$a:$b'则$符号会输出，单引号里的内容不会被bash解释

- echo $PATH /bin:/usr/bin:/usr/local/bin

- path 下面的目录的顺序。靠前的目录里的可执行文件会靠前执行

### 参数变量和内部变量
- test 命令：
  - test expression  [ expression ]  一定要有空格！

### 算术和字符串比较
赋值的时候要理解成：全都是字符串

### 与文件相关的测试

  -e 存在
  -d 是一个子目录
  -f 是一个普通文件
  -s 长度不为零
  -r 文件可读
  -w 可写
  -x 可执行

### 条件语句

  	read answer
	  if [ "$answer" = "yes" ]
	  then
	    statements
	  elif [ expression ]
	    statements
	  elif...
	  else
	    statements
	  fi
	  命令结束用反过来写。该换行的地方都要换行。缩进无所谓
	
	  case str in
	    str1|str2) statements;;
	    * ) state;;
	  esac

### 循环语句

	  for var in list
	  do
	   statements
	  done
	
	  #!/bin/sh
	  for file in $(ls f*.sh); do
	    lpr $file
	  done
	  exit 0
	
	  $(是特殊的标示符,表示将结果作为变量。
	  $((表示算出来
	
	  a=0
	  while [ "$a" -e "$LIMIT" ]
	  do
	    a=$(($a+1))
	      if [ "$a" -gt 2 ]
	      then
	  done
	
	  select item in Continue Finish
	  do
	    case "$itemm" in
	      Continue);;
	      Finish)break;;
	      * ) echo "wrong choice";;
	    esac
	  done

### 命令
  - || 前个命令失败，后面的才会执行
  - && 前面的成功了，后面的才会执行
  - 分号串联。
  - 成功或失败与进程标识有关。
  - 语句块大括号一定要分开，不分开是有别的作用的。
  - $1,$2等，表示当前脚本的第几个参数。$*是所有参数的清单
  - $最多只能到9.如果想到10的话请用${10}
  - 

### 函数定义和使用
	function func()
	{
	
	
	}
- function可以省略
- 调用：
```
func para1 para2
```
没有括号
- 最后一句执行成功返回0，失败返回1
- 定义局部变量要加local关键字
- $0:是脚本外面的0号参数的内容。脚本的文件名
  
### 其他
 - break
 - continue
 - exit n
 - return 
 - export:将变量导出到shell
 - set
 - unset：从环境中删除变量或函数
 - .  不会新开进程
 - :  什么都不干，用来占一个命令的位置
 - trap:发信号给进程。ctrl+c停掉，ctrl+z去后台。trap "echo hint" INT 
 - :>file.txt  清空一个文件

### 用反引号或dollar加小括号捕获命令输出

### 参数扩展※
重命名的时候我们不知道原来的名称。

	for srcfile in `*.cpp`
	do
		g++ $srcfile -o ?
	done  

${srcfile%.*}.o
	
	%从结尾去掉最短一段 %%去掉最长	
	#正好相反
	
### 即时文档<<
相当于一个没有文件名的文件.
到<<之后的标示符会停止读入