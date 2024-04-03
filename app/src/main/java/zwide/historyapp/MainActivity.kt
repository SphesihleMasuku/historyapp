package zwide.historyapp
//SPHESIHLE , MUZWAKHE , MASUKU
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    //declare
    private lateinit var searchButton: Button
    private lateinit var clearButton: Button
    private lateinit var ageInput: EditText
    private lateinit var resultTextView: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialise
        searchButton=findViewById(R.id.searchButton)
        clearButton=findViewById(R.id.clearButton)
        ageInput=findViewById(R.id.ageInput)
        resultTextView=findViewById(R.id.resultTextView)

        //make button clickable
        searchButton.setOnClickListener {
            //create a variable of age to get value from user
            val age = ageInput.text.toString().toIntOrNull()

            //if age not null and age is in the range between 20 and 100
            if ( age != null && age in 20..100) {

                //when age is 95 display Nelson Mandela else when is .. and so on
                val name = when (age) {
                    95 -> "NELSON MANDELA " +
                            "Improved the living standards and facilities of South African population." +
                            "He suffered for decades under apartheid." +
                            "Was sentenced to life in prison-Robbin island,was freed after 27 years"

                    39 -> "MARTIN LUTHER KING JR." +
                            "Was the American leader of the Civil Rights Movements." +
                            "He promoted the use of Non-Violence resistance." +
                            "He the Nobel prize for peace in 1964"

                    52 -> "MARCUS GARVEY." +
                            "He aimed at achieving black nationalism through celebrating African history." +
                            "Garvey campaigned for the end to colonial rule in Africa." +
                            "He envisioned a unified Africa"

                    52 -> "MARCUS AURELIUS." +
                            "He was one of many that practiced Stoicism." +
                            "Aurelius was the last of the Five Good Emperors." +
                            "He was a symbol of the Golden Age of the Rome Empire."


                    74 -> "JOSEPH STALIN." +
                            "He was the chief architect of Soviet Totalitarianism." +
                            "Former Premier of the Soviet Union"

                    64 -> "ADOLF HITLER." +
                            "He was the leader of the Nazi Party." +
                            "He made a campaign to exterminate the Jews." +
                            "He was considered on of the most evil humans in the world. "

                    41 -> "SHAKA ZULU." +
                            "He was the founder of the Zulu Empire in  Southern Africa." +
                            " He was a great strategist and military innovator." +
                            "Under his rule the Zulu Kingdom experienced significant expansion.  "

                    39 -> "MALCOM X." +
                            "Popularised Black Nationalism in America." +
                            "Malcom was a very charismatic speaker that attracted many African Americans towards the Black Power movement "

                    69 -> "MUAMMAR GADAFI." +
                            "Former leader of Libya." +
                            "He outlawed alcoholic beverages and gambling ." +
                            "  Was decorated with various awards and praised for his anti-imperialist stance "

                    78 ->"MAHATMA GANDHI." +
                            "His philosophy of non-violence that inspired Civil Rights movements around the world." +
                            "He was a Indian lawyer that lead his country to freedom from the British colonial rule." +
                            "Gandi was nominated for the Nobel prize five times but never received the award."


                    else -> null
                }
              val message = if (name != null) "Your age matches  $name"
                else "No historical figure found with age entered."
                resultTextView.text = message
            }else{
                resultTextView.text = "Invalid input. Please enter valid age between 20 and 100"
            }
        }
        clearButton.setOnClickListener {
            ageInput.text.clear()
            resultTextView.text = ""
        }
    }
}
//REFERENCE LIST
//NELSON MANDELA>http:natgeokids/2024/
//MARTIN LUTHER KINGJr>http:nmaahc.si.edu.com/2024/
//MARCUS GARVEY>http://britannica.com/2024/
//MARCUS AURELIUS>http:britannic.com/2024/
//JOSEPH STALIN >http:britannic.com/2024/
//ADOLF HITLER>http:britannic.com/2024/
//SHAKA ZULU>http:britannic.com/2024/
//MALCOM X>http://pbs.org/2024/
//MUAMMAR GADAFI>http://biography.com/2024/
//MAHATMA GANDHI>http://ww.npr.org/2024
