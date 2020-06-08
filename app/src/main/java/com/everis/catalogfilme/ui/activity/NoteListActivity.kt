import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.everis.catalogfilme.R
import com.everis.catalogfilme.intefaces.Endpoint
import com.everis.catalogfilme.model.Posts
import com.everis.catalogfilme.retrofit.NetworkUtils
import kotlinx.android.synthetic.main.activity_note_list.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NoteListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)

        getData()
    }

    fun getData() {
        val retrofitClient = NetworkUtils
            .getRetrofitInstance("https://api.themoviedb.org/3/movie/popular?api_key=1e97c0120cca01258168c6df2829322b&page=1&language=pt-BR")

        val endpoint = retrofitClient.create(Endpoint::class.java)
        val callback = endpoint.getPosts()

        callback.enqueue(object : Callback<List<Posts>> {
            override fun onFailure(call: Call<List<Posts>>, t: Throwable) {
                Toast.makeText(baseContext, t.message, Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<List<Posts>>, response: Response<List<Posts>>) {
                response.body()?.forEach {
                    textView.text = textView.text.toString().plus(it.body)
                }
            }
        })

    }
}