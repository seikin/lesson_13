package science.involta.lesson_13

import android.content.res.Resources
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    @get:Rule
    val activityRule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)
    var resources: Resources = InstrumentationRegistry.getInstrumentation().targetContext.resources
    private  lateinit var stringFromResources: String

    @Before
    fun getStringFromResources() {
        stringFromResources = resources.getString(R.string.test_text)
    }


    @Test
    fun checkIfStringIsCorrect() {
        onView(withId(R.id.text_container)).check(matches(withText(stringFromResources)))
    }
}

