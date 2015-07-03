/******************************************************************************
 ** Copyright (c) 2014-2015 Basis Technology Corporation.
 **
 ** Licensed under the Apache License, Version 2.0 (the "License");
 ** you may not use this file except in compliance with the License.
 ** You may obtain a copy of the License at
 **
 **     http://www.apache.org/licenses/LICENSE-2.0
 **
 ** Unless required by applicable law or agreed to in writing, software
 ** distributed under the License is distributed on an "AS IS" BASIS,
 ** WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ** See the License for the specific language governing permissions and
 ** limitations under the License.
 ******************************************************************************/

package com.basistech.rosette.apimodel.jackson;

import com.basistech.rosette.apimodel.InputUnit;
import com.basistech.rosette.apimodel.LanguageOptions;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class LanguageRequestMixin {
    @JsonCreator
    public LanguageRequestMixin(
            @JsonProperty("content") String content,
            @JsonProperty("contentUri") String contentUri,
            @JsonProperty("contentType") String contentType,
            @JsonProperty("unit") InputUnit unit,
            @JsonProperty("options") LanguageOptions options
    ) {
        //
    }

}