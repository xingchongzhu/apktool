一、apk反编译并重新打包
1.反编译
apktool.bat d -f xxx.apk -o xxx

2.重新打包
apktool.bat b -f xxx -o xxx.apk

3.签名
jarsigner -verbose -sigalg SHA1withRSA -digestalg SHA1 -keystore Royole_platform.jks -storepass royole_platform 待签名的APK文件名 royole

二、java转smil格式文件
1.xxx.java转xxx.class
javac xxx.java

2.xxx.class转为xxx.dex
java -jar dx.jar --dex --output=User.dex  com/User.class

3.xxxx.dex转 xxx.smail
java -jar baksmali-2.5.2.jar disassemble -o xxx com/User.dexj

三、apk或jar源码查看
jadx-gui-1.0.0.exe
