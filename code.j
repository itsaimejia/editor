.class public Codigo
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 20
.limit locals 20
bipush 10
bipush 10
iadd
bipush 5
imul
istore 0
iload 0
bipush 2
idiv
istore 1
iload 0
iload 1
if_icmpgt IFBODY
goto ELSEBODY
IFBODY:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Entrando al if
"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Ejecutando un ciclo
"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
bipush 0
istore 2
iload 2
bipush 20
if_icmplt WHILEBODY
goto DONE
WHILEBODY:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 2
invokevirtual java/io/PrintStream/println(I)V
iload 2
bipush 1
iadd
istore 2
iload 2
bipush 20
if_icmplt WHILEBODY
DONE:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Fin del ciclo en if
"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
goto END
ELSEBODY:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Entrando al else
"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Ejecutando un ciclo
"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
bipush 0
istore 2
iload 2
bipush 20
if_icmplt WHILEBODY
goto DONE
WHILEBODY:
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 2
invokevirtual java/io/PrintStream/println(I)V
iload 2
bipush 1
iadd
istore 2
iload 2
bipush 20
if_icmplt WHILEBODY
DONE:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Fin del else
"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
goto END
END:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "Fin de mi proyecto
"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc ":)
"
invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
return
.end method
