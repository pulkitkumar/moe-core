/* GENETATED SOURCE CODE, DO NOT EDIT! */

/*
 * Copyright (c) 2014-2016, Intel Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


#include <iostream>

#include "thread.h"

// This was automatically generated by /Volumes/SSD/Android/inde-windows/art/tools/generate-operator-out.py --- do not edit!
namespace art {
std::ostream& operator<<(std::ostream& os, const StackedShadowFrameType& rhs) {
  switch (rhs) {
    case StackedShadowFrameType::kShadowFrameUnderConstruction: os << "ShadowFrameUnderConstruction"; break;
    case StackedShadowFrameType::kDeoptimizationShadowFrame: os << "DeoptimizationShadowFrame"; break;
  }
  return os;
}
}  // namespace art

// This was automatically generated by /Volumes/SSD/Android/inde-windows/art/tools/generate-operator-out.py --- do not edit!
namespace art {
std::ostream& operator<<(std::ostream& os, const ThreadFlag& rhs) {
  switch (rhs) {
    case kSuspendRequest: os << "SuspendRequest"; break;
    case kCheckpointRequest: os << "CheckpointRequest"; break;
    case kActiveSuspendBarrier: os << "ActiveSuspendBarrier"; break;
    default: os << "ThreadFlag[" << static_cast<int>(rhs) << "]"; break;
  }
  return os;
}
}  // namespace art

// This was automatically generated by /Volumes/SSD/Android/inde-windows/art/tools/generate-operator-out.py --- do not edit!
namespace art {
std::ostream& operator<<(std::ostream& os, const ThreadPriority& rhs) {
  switch (rhs) {
    case kMinThreadPriority: os << "MinThreadPriority"; break;
    case kNormThreadPriority: os << "NormThreadPriority"; break;
    case kMaxThreadPriority: os << "MaxThreadPriority"; break;
    default: os << "ThreadPriority[" << static_cast<int>(rhs) << "]"; break;
  }
  return os;
}
}  // namespace art
