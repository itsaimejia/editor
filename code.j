.class public Codigo
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 20
.limit locals 20
bipush 0
istore 0
bipush 1
bipush 1
if_icmpeq IFBODY
goto ELSEBODY
IFBODY:
iload 0
bipush 10
if_icmplt WHILEBODY
goto DONE
WHILEBODY:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 0
invokevirtual java/io/PrintStream/println(I)V
iload 0
bipush 1
iadd
istore 0
iload 0
bipush 10
if_icmplt WHILEBODY
DONE:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Lo logre
"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
goto END
ELSEBODY:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Quede...
"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
goto END
END:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Adios Mundo!
"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
return
.end method
