using Microsoft.VisualStudio.TestTools.UnitTesting;
using CalculadoraCore;

namespace TestsCalculadora
{
    [TestClass]
    public class TestsCalculadora
    {
        [TestMethod]
        public void TestSumarPositivos()
        {
            // Arrange
            Calculadora calculadora = new Calculadora();
            // Act
            int resultado = calculadora.Sumar(3, 5);
            // Assert
            Assert.AreEqual(8, resultado);
        }
    }
}
