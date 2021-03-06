package com.bdlbsc.common.user;




import com.bdlbsc.common.base.BaseResponse;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UserRegisteredPhonenumberResponse   extends BaseResponse {

    private String access_token;
    private String refresh_token;

}
