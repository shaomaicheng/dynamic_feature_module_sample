dynamic feature module demo
持续更新。。


https://developer.android.com/guide/playcore/feature-delivery?hl=zh-cn

dynamic-feature-module可以做什么：

- 减少包大小，play store上架后进行分包动态下载安装。
- app作为壳工程，编译的时候做 app，module1，module2，首次编译后，修改了module2，可以只编译module2，然后通过 adb install-multiple 去安装 app,module1，module2的apk
- 给每个module配置一个壳工程，可以实现快速编译运行某个模块的功能

遇到的问题

- wmrotuer类似的asm生成字节码做初始化的库需要适配一下，不能生成的字节码文件是同一个，否则就算通过反射去初始化，在其他模块还是只会获取到第一个dex里面的字节码文件类
- 资源访问问题。（还没细看）



### 运行dmeo
安装命令

build之后： app/build下执行 
```agsl
adb install app-debug.apk
```
跳转均无效

把dynamic1 和 dynamic2的apk一起安装
```agsl
adb install-multiple app-debug.apk dynamic1-debug.apk dynamic2-debug.apk 
```

两个跳转均生效