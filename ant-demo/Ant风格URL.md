请求



# 目录



## 基本用法

```java
@RequestMapping("/aa/test")
public Object test1(){
  return "ok";
}
```



## 路径参数

```java
@RequestMapping("/test/{id}")
public Object testid(@PathVariable("id") Integer id){
  return id;
}
```



## 请求参数

```java
@RequestMapping("/test")
public Object testId(@RequestParam("id")Integer id){
  return id;
}
```



> @RequestParam注解一共有三个属性：

- value：指定为形参赋值的请求参数的参数名。

- required:设置是否必须传输此请求参数，默认值为true。
  若设置为true时，则当前请求必须传输value所指定的请求参数，若没有传输该请求参数，且没有设置defaultValue属性，则页面报错400:Required String parameter ‘xxx’ is not present;
  若设置为false，则当前请求不是必须传输value所指定的请求参数，若没有传输，则注解所标识的形参的值为null。
- defaultValue:不管required属性值为true或false，当value所指定的请求参数没有传输或传输的值为“”时，则使用默认值为形参赋值。

## 公共请求前缀

```java
@RestController
@RequestMapping("/ant")
public class Controller {

}
```



## Ant风格路径

Ant通配符有三种：

| 通配符 | 说明                    |
| ------ | ----------------------- |
| ?      | 匹配任何单字符          |
| *      | 匹配0或者任意数量的字符 |
| **     | 匹配0或者更多的目录     |



### 任意单字符

```java
@RequestMapping("/a?a/test")
public Object test1(){
  return "ok";
}
```



### 任意字符

```java
@RequestMapping("/a*a/test")
public Object test1(){
  return "ok";
}
```



### 任意目录

```java
@RequestMapping("/**/test")
public Object testxx(){
  return "ok";
}
```

报错：（由于spring5.3.0之后路径通配的配置发生了变化）

```java
Invalid mapping pattern detected: /**/test
^
No more pattern data allowed after {*...} or ** pattern element
```



```yaml
spring:
  mvc:
    pathmatch:
      matching-strategy: ant_path_matcher

```

或者：

```java
@RequestMapping("/*/test")
public Object testxx(){
  return "ok-**";
}
```



### 注意

```java
@RequestMapping("/b**b/test")
public Object testxx(){
  return "ok-**";
}
```



