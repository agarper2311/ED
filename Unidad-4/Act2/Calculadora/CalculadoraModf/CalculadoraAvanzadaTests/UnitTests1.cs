using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using CalculadoraAvanzada;

namespace CalculadoraAvanzadaTests
{
    [TestClass]
    public class CalculadoraTest
    {
        private Calculadora calculadora;

        [TestInitialize]
        public void TestInitialize()
        {
            // Inicialización para cada prueba
            calculadora = new Calculadora();
        }

        [TestMethod]
        public void TestSuma()
        {
            // Prueba para el método Suma
            double resultado = calculadora.Suma(5, 3);
            Assert.AreEqual(8, resultado);
        }

        [TestMethod]
        public void TestResta()
        {
            // Prueba para el método Resta
            double resultado = calculadora.Resta(5, 3);
            Assert.AreEqual(2, resultado);
        }

        [TestMethod]
        public void TestMultiplicacion()
        {
            // Prueba para el método Multiplicacion
            double resultado = calculadora.Multiplicacion(5, 3);
            Assert.AreEqual(15, resultado);
        }

        [TestMethod]
        public void TestDivision()
        {
            // Prueba para el método Division
            double resultado = calculadora.Division(6, 3);
            Assert.AreEqual(2, resultado);
        }

        [TestMethod]
        [ExpectedException(typeof(DivideByZeroException))]
        public void TestDivisionPorCero()
        {
            // Prueba para asegurarse de que se lanza una excepción en caso de división por cero
            calculadora.Division(5, 0);
        }
    }
}