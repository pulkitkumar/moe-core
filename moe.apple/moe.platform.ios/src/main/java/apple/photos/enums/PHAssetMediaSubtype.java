/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.photos.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class PHAssetMediaSubtype {
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    @Generated @NUInt public static final long PhotoPanorama = 0x0000000000000001L;
    @Generated @NUInt public static final long PhotoHDR = 0x0000000000000002L;
    @Generated @NUInt public static final long PhotoScreenshot = 0x0000000000000004L;
    @Generated @NUInt public static final long PhotoLive = 0x0000000000000008L;
    @Generated @NUInt public static final long PhotoDepthEffect = 0x0000000000000010L;
    @Generated @NUInt public static final long VideoStreamed = 0x0000000000010000L;
    @Generated @NUInt public static final long VideoHighFrameRate = 0x0000000000020000L;
    @Generated @NUInt public static final long VideoTimelapse = 0x0000000000040000L;

    @Generated
    private PHAssetMediaSubtype() {
    }
}
