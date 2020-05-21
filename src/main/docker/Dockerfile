FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD springboot-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]


# ADD springboot-0.0.1-SNAPSHOT.jar app.jar 中的springboot-0.0.1-SNAPSHOT.jar根据pom文件中"<version>0.0.1-SNAPSHOT</version>  <name>springboot</name>"而定，格式为:
# "name"+"-"+"version"+".jar"
# springboot-0.0.1-SNAPSHOT.jar
#
# Dockerfile文件作用：构建 Jdk 基础环境，添加 Spring Boot Jar 到镜像中
#
#> FROM ，表示使用 Jdk8 环境 为基础镜像，如果镜像不是本地的会从 DockerHub 进行下载
#> VOLUME ，指向了一个 /tmp 的目录，由于 Spring Boot 使用内置的Tomcat容器，Tomcat 默认使用 /tmp 作为工作目录。这个命令的效果是：在宿主机的 /var/lib/docker 目录下创建一个临时文件并把它链接到容器中的 /tmp 目录
#> ADD ，拷贝文件并且重命名
#> ENTRYPOINT ，为了缩短 Tomcat 的启动时间，添加 java.security.egd 的系统属性指向 /dev/urandom 作为 ENTRYPOINT

#创建dockerfile文件，并编辑 vi dockerfile，内容如下：
#FROM openjdk:11
#VOLUME /tmp
#ADD mycrawler-server-1.0.jar app.jar
#EXPOSE 9091
#ENTRYPOINT [“java”,"-jar",“app.jar”,"–spring.profiles.active=dev","–server.port=9091",">/log/app.log"]
#FROM指定基础镜像，这里是引入Java开发环境openjdk11，一定要与项目相对应，否是会启动失败。
#如果docker容器中没有openjdk11镜像，在执行dockerfile 文件得第一条FROM命令会自动拉取openjdk11镜像。
#注意：dockerfile文件必须命名为dockerfile，否则会报unable to prepare context: unable to evaluate symlinks in Dockerfile path: GetFileAttributesEx
#————————————————
#版权声明：本文为CSDN博主「Yun---Sani」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
#原文链接：https://blog.csdn.net/weixin_38705082/article/details/93890478