package linear.app.bel.classlayout.adapter

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import linear.app.bel.classlayout.R
import linear.app.bel.classlayout.listener.OnItemClickListener
import linear.app.bel.classlayout.model.User

class CustomAdapter(val userList: ArrayList<User>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    private companion object {
        var callback: onSuggestResultListener? = null
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.txtName?.text = userList[position].name
        holder?.txtTitle?.text = userList[position].title

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        private val itemClickListener: OnItemClickListener? = null
        var txtName : TextView? = null
        var txtTitle : TextView? = null
        init {
            txtName = itemView.findViewById<TextView>(R.id.txtName)
            txtTitle = itemView.findViewById<TextView>(R.id.txtTitle)
            itemView.setOnClickListener(View.OnClickListener {
                var value = adapterPosition
                Log.d("masuk" , "posisi : "+value)

                callback?.onSuggestResult(value)
                //onItemClickListener = itemClickListener
                //onItemClickListener?.onItemClick(value)
            })
        }


    }

    interface onSuggestResultListener {
        fun onSuggestResult(posisi : Int)
    }

    fun setOnSuggestResultListener(x: onSuggestResultListener) {
        callback = x
    }


}