using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CalculadoraJunit
{
    public class Calculadora
    {
        // Método para sumar dos números
        public int sum(int num1, int num2)
        {
            return num1 + num2;
        }

        // Método para multiplicar dos números
        public int multiplication(int num1, int num2)
        {
            return num1 * num2;
        }

        public int resta(int num1, int num2)
        {
            return num1 - num2;
        }

        public int division(int num1, int num2)
        {
            return num1 % num2;
        }
        // Método para devolver "Hello World"
        public string helloWorld()
        {
            return "Hello World";
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            var calculadora = new Calculadora();

            try
            {
                Console.WriteLine("Ingrese el primer número:");
                double num1 = Convert.ToDouble(Console.ReadLine());

                Console.WriteLine("Ingrese el segundo número:");
                double num2 = Convert.ToDouble(Console.ReadLine());

                Console.WriteLine("Seleccione la operación (suma, resta, multiplicacion, division):");
                string operacion = Console.ReadLine();

                double resultado = 0;

                switch (operacion.ToLower())
                {
                    case "suma":
                        resultado = calculadora.sum((int)num1, (int)num2); 
                        break;
                    case "resta":
                        resultado = calculadora.resta((int)num1, (int)num2);
                        break;
                    case "multiplicacion":
                        resultado = calculadora.multiplication((int)num1, (int)num2);
                        break;
                    case "division":
                        resultado = calculadora.division((int)num1, (int)num2);
                        break;
                    default:
                        Console.WriteLine("Operación no válida");
                        return;
                }

                Console.WriteLine($"El resultado es: {resultado}");
            }
            catch (FormatException)
            {
                Console.WriteLine("Error: Formato de número no válido.");
            }
            catch (DivideByZeroException ex)
            {
                Console.WriteLine(ex.Message);
            }

            Console.WriteLine("Presione cualquier tecla para salir.");
            Console.ReadLine();
        }
    }
}
