package www.top.com;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class top_adapter extends RecyclerView.Adapter<top_adapter.topViewHolder> {
    String[] title;
    int[] photo;

    Context context;
    String details[];

    public top_adapter(String[] title, int[] photo,String details[],Context context) {
        this.title = title;
        this.photo = photo;
        this.details=details;
        this.context=context;

    }

    @NonNull
    @Override
    public topViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View topView= LayoutInflater.from(parent.getContext()).inflate(R.layout.top_item,parent,false);
        return new topViewHolder(topView);
    }

    @Override
    public void onBindViewHolder(@NonNull topViewHolder holder, final int position) {
        holder.tvtitle.setText(title[position]);
        holder.ivphoto.setImageResource(photo[position]);

        holder.ivphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,details_activity.class);
                intent.putExtra("photo",photo[position]);
                intent.putExtra("titles",title[position]);
                intent.putExtra("position",position);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return title.length;
    }

    public class topViewHolder extends RecyclerView.ViewHolder{

        TextView tvtitle;
        ImageView ivphoto;
        public topViewHolder(@NonNull View itemView) {
            super(itemView);
            tvtitle=itemView.findViewById(R.id.tvtitle);
            ivphoto=itemView.findViewById(R.id.ivphoto);
        }
    }
}
