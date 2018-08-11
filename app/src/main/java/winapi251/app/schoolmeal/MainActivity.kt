package winapi251.app.schoolmeal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/** 메인 액티비티 */
class MainActivity : AppCompatActivity()
{
    /** 메인 액티비티가 생성될 때 호출된다. */
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
