package com.pedromassango.architecture_bestpratice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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
            // TODO: show add phrase dialog
        }

        return super.onOptionsItemSelected(item)
    }

}
