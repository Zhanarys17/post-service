package kz.zhan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostModel {
    private String postId;
    private String clientId;
    private String postRecipientId;
    private String postItem;
    private String status;
}
