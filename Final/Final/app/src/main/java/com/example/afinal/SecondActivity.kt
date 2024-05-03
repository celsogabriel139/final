import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.afinal.R

class SecondActivit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnAddUser = findViewById<Button>(R.id.btnAddUser)
        btnAddUser.setOnClickListener {
            val etName = findViewById<EditText>(R.id.etName)
            val etAge = findViewById<EditText>(R.id.etAge)
            val etPhone = findViewById<EditText>(R.id.etPhone)
            val etHobby = findViewById<EditText>(R.id.etHobby)
            val spGender = findViewById<Spinner>(R.id.spGender)

            val name = etName.text.toString()
            val age = etAge.text.toString()
            val phone = etPhone.text.toString()
            val hobby = etHobby.text.toString()
            val gender = spGender.selectedItem.toString()

            if (name.isNotEmpty() && age.isNotEmpty() && phone.isNotEmpty() && hobby.isNotEmpty()) {
                // Adicionar usuário à lista ou fazer outra ação desejada
                // Aqui você pode adicionar a lógica para armazenar os dados do usuário
                Toast.makeText(this, "Usuário adicionado!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
