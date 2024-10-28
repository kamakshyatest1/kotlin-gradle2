package helloworldkotlin
import org.apache.commons.text.StringSubstitutor
import org.apache.commons.text.lookup.StringLookup
import org.apache.commons.text.lookup.StringLookupFactory

fun main() {
    // Create a StringLookup object
    val stringLookup: StringLookup = StringLookupFactory.INSTANCE.mapStringLookup(
        mapOf(
            "name" to "John",
            "age" to "30"
        )
    )

    // Create a StringSubstitutor using the StringLookup
    val stringSubstitutor = StringSubstitutor(stringLookup)

    // Define a template string with placeholders
    val template = "Hello, my name is \${name} and I am \${age} years old."

    // Substitute placeholders with actual values
    val result = stringSubstitutor.replace(template)

    // Print the result
    println(result)
}