a, b = 0, 1
n = int(input("Ingrese un número entero: "))
if n <= 0:
    print("Ingrese un número entero positivo")
elif n == 1:
    print("Serie de Fibonacci hasta",n,":")
    print(a)
else:
    print("Serie de Fibonacci:")
    for i in range(0, n):
        print(a)
        c = a + b
        a = b
        b = c