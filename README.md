# Hadoop configuration printer

This code is based on an answer on stack overflow [stack overflow](https://stackoverflow.com/questions/12774988/how-do-i-print-hadoop-properties-in-command-line) but I have elaborated that example with a maven structure so it is ready to compile and use.

To run this code, you will need to have a version of Hadoop, git, maven and java (version 8 or above). 
Once you have those, here is the process for downloading, compiling and running the code.

```bash
$ git clone https://github.com/tdunning/config-print.git
Cloning into 'config-print'...
remote: Enumerating objects: 13, done.
remote: Counting objects: 100% (13/13), done.
remote: Compressing objects: 100% (8/8), done.
remote: Total 13 (delta 1), reused 12 (delta 0), pack-reused 0
Unpacking objects: 100% (13/13), done.
$ cd config-print/
$ mvn -q package
$ ./target/config-printer | sort
log4j:WARN No appenders could be found for logger (org.apache.hadoop.util.Shell).
log4j:WARN Please initialize the log4j system properly.
log4j:WARN See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info.
dfs.ha.fencing.ssh.connect-timeout = 30000
file.blocksize = 67108864
file.bytes-per-checksum = 512
file.client-write-packet-size = 65536
file.replication = 1
file.stream-buffer-size = 4096
fs.AbstractFileSystem.file.impl = org.apache.hadoop.fs.local.LocalFs
fs.AbstractFileSystem.ftp.impl = org.apache.hadoop.fs.ftp.FtpFs
fs.AbstractFileSystem.har.impl = org.apache.hadoop.fs.HarFs
fs.AbstractFileSystem.hdfs.impl = org.apache.hadoop.fs.Hdfs
fs.AbstractFileSystem.viewfs.impl = org.apache.hadoop.fs.viewfs.ViewFs
... lots of stuff deleted ...
s3native.stream-buffer-size = 4096
s3.replication = 3
s3.stream-buffer-size = 4096
tfile.fs.input.buffer.size = 262144
tfile.fs.output.buffer.size = 262144
tfile.io.chunk.size = 1048576
tdunning@nodea:~/config-print$ 
$
```