package com.test.listviewtest;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
	//private String[] data= { "Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry","Cherry","Mango"};
	private List<Fruit> fruitList = new ArrayList<Fruit>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initFruits();
		FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
		//ArrayAdapter<String> adapter = new ArrayAdapter<String> (
			//MainActivity.this, android.R.layout.simple_list_item_1, data);
		ListView listView =(ListView) findViewById(R.id.list_view);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener(){
			@Override
			public void onItemClick(AdapterView<?> patent, View view,
					int position, long id) {
				Fruit fruit =fruitList.get(position);
				Toast.makeText(MainActivity.this,fruit.getName(),
						Toast.LENGTH_SHORT).show();
			}
		});
	}
	 private void initFruits() {
	 Fruit apple = new Fruit("apple",R.drawable.mingren);
	 fruitList.add(apple);
	 Fruit banana = new Fruit("banana",R.drawable.mingren);
	 fruitList.add(banana);
	 Fruit orange = new Fruit("orange",R.drawable.mingren);
	 fruitList.add(orange);
	 Fruit watermelon = new Fruit("watermelon",R.drawable.mingren);
	 fruitList.add(watermelon);
	 Fruit pear = new Fruit("pear",R.drawable.mingren);
	 fruitList.add(pear);
	 Fruit grape = new Fruit("grape",R.drawable.mingren);
	 fruitList.add(grape);
	 Fruit pineapple = new Fruit("pineapple",R.drawable.mingren);
	 fruitList.add(pineapple);
	 Fruit strawberry = new Fruit("strawberry",R.drawable.mingren);
	 fruitList.add(strawberry);
	 Fruit cherry = new Fruit("cherry",R.drawable.mingren);
	 fruitList.add(cherry);
	 Fruit mango = new Fruit("mango",R.drawable.mingren);
	 fruitList.add(mango);
	 Fruit added1 = new Fruit("added1",R.drawable.mingren);
	 fruitList.add(added1);
	 Fruit added2 = new Fruit("added2",R.drawable.mingren);
	 fruitList.add(added2); 
	 Fruit added3 = new Fruit("added3",R.drawable.mingren);
	 fruitList.add(added3);
	 Fruit added4 = new Fruit("added4",R.drawable.mingren);
	 fruitList.add(added4);
	 Fruit added5 = new Fruit("added5",R.drawable.mingren);
	 fruitList.add(added5);
	 Fruit added6 = new Fruit("added6",R.drawable.mingren);
	 fruitList.add(added6);
	 Fruit added7 = new Fruit("added7",R.drawable.mingren);
	 fruitList.add(added7);
	 
	}
}
