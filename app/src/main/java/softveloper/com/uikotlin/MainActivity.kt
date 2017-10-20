package softveloper.com.uikotlin

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.util.TypedValue
import android.view.View
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = Button(this)
        val buttonParams = RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT)
        val editText = EditText(this)
        val editTextParams = RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT)
        val layout = RelativeLayout(this)

        button.id = 1
        button.setBackgroundColor(Color.GREEN)
        button.text = "Click Here"

        buttonParams.addRule(RelativeLayout.CENTER_HORIZONTAL)
        buttonParams.addRule(RelativeLayout.CENTER_VERTICAL)

        editText.width = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200F, this.resources.displayMetrics).toInt()

        editTextParams.addRule(RelativeLayout.ABOVE, button.id)
        editTextParams.addRule(RelativeLayout.CENTER_HORIZONTAL)
        editTextParams.setMargins(0, 0, 0, 50)

        layout.setBackgroundColor(Color.BLUE)
        layout.addView(button, buttonParams)
        layout.addView(editText, editTextParams)

        setContentView(layout)
    }
}
