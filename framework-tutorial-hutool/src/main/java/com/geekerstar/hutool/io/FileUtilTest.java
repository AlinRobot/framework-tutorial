package com.geekerstar.hutool.io;

/**
 * @author geekerstar
 * date: 2019/11/30 15:09
 * description: https://www.hutool.cn/docs/#/core/IO/%E6%96%87%E4%BB%B6%E5%B7%A5%E5%85%B7%E7%B1%BB-FileUtil
 *
 * 简介
 * 在IO操作中，文件的操作相对来说是比较复杂的，但也是使用频率最高的部分，我们几乎所有的项目中几乎都躺着一个叫做FileUtil或者FileUtils的工具类，我想Hutool应该将这个工具类纳入其中，解决用来解决大部分的文件操作问题。
 *
 * 总体来说，FileUtil类包含以下几类操作工具：
 *
 * 文件操作：包括文件目录的新建、删除、复制、移动、改名等
 * 文件判断：判断文件或目录是否非空，是否为目录，是否为文件等等。
 * 绝对路径：针对ClassPath中的文件转换为绝对路径文件。
 * 文件名：主文件名，扩展名的获取
 * 读操作：包括类似IoUtil中的getReader、readXXX操作
 * 写操作：包括getWriter和writeXXX操作
 * 在FileUtil中，我努力将方法名与Linux相一致，例如创建文件的方法并不是createFile，而是touch，这种统一对于熟悉Linux的人来说，大大提高了上手速度。当然，如果你不熟悉Linux，那FileUtil工具类的使用则是在帮助你学习Linux命令。这些类Linux命令的方法包括：
 *
 * ls 列出目录和文件
 * touch 创建文件，如果父目录不存在也自动创建
 * mkdir 创建目录，会递归创建每层目录
 * del 删除文件或目录（递归删除，不判断是否为空），这个方法相当于Linux的delete命令
 * copy 拷贝文件或目录
 * 这些方法提供了人性化的操作，例如touch方法，在创建文件的情况下会自动创建上层目录（我想对于使用者来说这也是大部分情况下的需求），同样mkdir也会创建父目录。
 *
 * 需要注意的是，del方法会删除目录而不判断其是否为空，这一方面方便了使用，另一方面也可能造成一些预想不到的后果（比如拼写错路径而删除不应该删除的目录），所以请谨慎使用此方法。
 */
public class FileUtilTest {
}
