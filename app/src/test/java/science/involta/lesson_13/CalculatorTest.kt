package science.involta.lesson_13

import org.junit.*
import org.junit.Assert.*
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)

class CalculatorTest {
    private  var calculator: Calculator? = null

    @Before
    fun initialize() {
        calculator = Calculator.instance

    }

//    @Ignore("Пока не разобрался почему не работает")
    @Test(timeout = 1000)
    fun addTest() {
        calculator!!.add(2,4)
        Assert.assertEquals(6, calculator?.result)
    }

    @Test(timeout = 1000)
    fun divideTest() {
        calculator!!.div(9,3)
        Assert.assertEquals(3, calculator?.result)
    }

    @Test(timeout = 1000)
    fun divideByZeroTest() {
        calculator!!.div(8,0)
        Assert.assertEquals("На ноль делить нельзя", calculator?.error)
    }



    @After
    fun deinitialize() {
        calculator = null
    }

    companion object {
        @BeforeClass
        @JvmStatic
        fun initClass() {
            println("Выполнилась функция помеченная аннотацией @BeforeClass")
        }

        @AfterClass
        @JvmStatic
        fun deinitClass() {
            println("Выполнилась функция помеченная аннотацией @AfterClass")
        }
    }


}