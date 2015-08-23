# 门面模式

Tags: 设计模式 读书笔记 技术

---

门面模式有两个作用：一是简化类的接口；二是消除类与使用它的客户代码之间的耦合。

## 门面模式和适配器模式的区别

适配器是一种包装器，用来对接口进行适配以便在不兼容的系统中使用它。而创建门面元素则是图个方便。它并不用于达到与需要特定接口的客户系统打交道的目的，而是用于提供一个简化的接口。

## 门面模式的适用场合

判断是否应该使用门面模式的关键在于辨识那些反复出现的代码。例如：在处理跨浏览器的差异问题时最好的解决办法就是把这些差异抽取到门面方法中。

## 门面模式之利

门面模式方便了开发人员，并且提供了较高层的功能，还能降低对外部代码的依赖程度。通过使用门面模式，可以避免与下层子系统紧密耦合。

## 门面模式之弊

有时相比一个庞杂的门面函数，其组成函数在粒度方面更有吸引力。这是因为门面函数可能常常需要执行一些你并不需要的任务。