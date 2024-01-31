using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CalculadoraAvanzada
{
    public class Calculadora
    {
        // Método para sumar dos números
        public double Suma(double num1, double num2)
        {
            return num1 + num2;
        }

        // Método para restar dos números
        public double Resta(double num1, double num2)
        {
            return num1 - num2;
        }

        // Método para multiplicar dos números
        public double Multiplicacion(double num1, double num2)
        {
            return num1 * num2;
        }

        // Método para dividir dos números
        public double Division(double num1, double num2)
        {
            if (num2 == 0)
            {          // sacado de stackoverflow
                throw new DivideByZeroException("No se puede dividir por cero.");
            }
            return num1 / num2;
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
                            resultado = calculadora.Suma(num1, num2);
                            break;
                        case "resta":
                            resultado = calculadora.Resta(num1, num2);
                            break;
                        case "multiplicacion":
                            resultado = calculadora.Multiplicacion(num1, num2);
                            break;
                        case "division":
                            resultado = calculadora.Division(num1, num2);
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
}