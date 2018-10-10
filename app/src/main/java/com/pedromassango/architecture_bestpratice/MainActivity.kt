package com.pedromassango.architecture_bestpratice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {

    private val adapter: MyAdpter by lazy{
        MyAdpter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        // inialize my recyclerView
        recycler_view.adapter = adapter


        adapter.add( Phrase(1, "Simple Test"))
        adapter.add( Phrase(4, "Simple Test 2"))
        adapter.add( Phrase(5, "Simple Test 3"))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        if(R.id.action_add == item!!.itemId){
            showDialogNewWord()
        }

        return super.onOptionsItemSelected(item)
    }

    /**
     * Show a input dialog to type a phrase
     * and add it in database
     */
    private fun showDialogNewWord() {
        val edtPhrase = EditText(this)

        AlertDialog.Builder(this)
                .setTitle("Type a phrase")
                .setView(edtPhrase)
                .setNegativeButton("Cancel", null)
                .setPositiveButton("Save") { dialogInterface, i ->
                    val text = edtPhrase.text.toString()

                    // if there is a text, save it
                    if (!text.trim { it <= ' ' }.isEmpty()) {
                        val phrase = Phrase(text = text)

                        //TODO: save in room database
                    }
                }
                .create()
                .show() // show dialog
    }


}
