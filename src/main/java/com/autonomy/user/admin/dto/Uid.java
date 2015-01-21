package com.autonomy.user.admin.dto;

import com.autonomy.aci.client.annotations.IdolBuilder;
import com.autonomy.aci.client.annotations.IdolBuilderBuild;
import com.autonomy.aci.client.annotations.IdolDocument;
import com.autonomy.aci.client.annotations.IdolField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@IdolDocument("autn:uid")
@Data
public class Uid {

    private final long uid;

    private Uid(final long uid) {
        this.uid = uid;
    }

    @IdolBuilder
    @IdolDocument("autn:uid")
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Builder {

        private long uid;

        @IdolField("autn:uid")
        public Builder setUid(long uid) {
            this.uid = uid;
            return this;
        }

        @IdolBuilderBuild
        public Uid build() {
            return new Uid(uid);
        }

    }
}
