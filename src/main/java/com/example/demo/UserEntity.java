package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity//Entityクラス(ドメインクラス)であることを示す。DB問合せ結果をここに保存しておく。
@Data//GetterとSetterを記述しなくてもLombokが裏でそれらを用意してくれる。
@Table(name="user")//テーブル名を記述
public class UserEntity {
	@Id//主キーにつける。必須。ないとエラー。
	@Column(name="id")//フィールド名
	private int id;

	@Column(name="name")//フィールド名
	private String name;
}
