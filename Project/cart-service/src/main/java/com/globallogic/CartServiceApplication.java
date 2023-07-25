package com.globallogic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CartServiceApplication {

	public static void main(String[] args) {

		CartServiceApplication cartServiceApplication=new CartServiceApplication();
		SpringApplication.run(CartServiceApplication.class, args);
//		cartServiceApplication.fun();
		cartServiceApplication.main();
	}

	public int fun (int A, int B){
		if(B==0)
			return A;
		else
			return fun(B,A%B);
	}
	public void main(){
		int ans = fun(100, 2000);
		System.out.println(ans);
	}
}
