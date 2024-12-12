package com.example.samuraitravel.form;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReviewEditForm {
	@NotNull
    private Integer id;
	
	@NotNull(message = "評価を入力してください。")
	@Min(value = 1, message = "評価は1以上で入力してください。")
	@Max(value = 5, message = "評価は5以下で入力してください。")
	private Integer score;
	
	@NotBlank(message = "レビューを書き込んでください")
	private String comment;
		
}