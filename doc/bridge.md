# 桥街模式

Tags: 设计模式 读书笔记 技术

---

## 桥接模式

按GoF的定义，桥接模式的作用在于“将抽象与其实现隔离开来，以便二者独立变化”。它可以促进代码的模块化，促成更简洁的实现并提高抽象的灵活性。

## 适用场合

适用于JavaScript中常见的事件驱动编程，使接口是“可桥接（bridgeable）”，实际上也就是“可适配（adaptable）”。

## 桥接模式之利

把抽象与其实现隔离开，有助于独立的管理软件的各个组成部分。桥接元素应该是粘合每一个抽象的粘合因子。

## 桥接模式之弊

每使用一个桥接元素都要增加一次函数调用，这对应用程序的性能会有一些负面影响。除此之外，他们也提高了系统的复杂性，在出现问题时导致代码更难调试。大多数情况下桥接模式非常有用，但注意不要滥用。