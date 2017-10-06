package cn.edu.bzu.learnrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by dpl on 2017/7/31 0031.
 */
class MyAdapter extends RecyclerView.Adapter {
    //private String[] data = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};

    class ViewHolder extends RecyclerView.ViewHolder {
        private View root;
        private TextView tvTitle;
        private TextView tvContent;

        public ViewHolder(View root) {
            super(root);
            tvTitle=root.findViewById(R.id.tvTitle);
            tvContent=root.findViewById(R.id.tvContent);
        }

        public TextView getTvTitle() {
            return tvTitle;
        }

        public TextView getTvContent() {
            return tvContent;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_cell,null));
        //LayoutInflater.from():布局解析器
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        CellData cellData=data[position];
        viewHolder.getTvTitle().setText(cellData.title);
        viewHolder.getTvContent().setText(cellData.content);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }
    private CellData[] data=new CellData[]{new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻"),new CellData("极客学院","IT教育"),new CellData("新闻","不错的新闻")};
}
