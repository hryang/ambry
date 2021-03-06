/**
 * Copyright 2016 LinkedIn Corp. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
package com.github.ambry.store;

/**
 * A key and value that represents an index entry
 */
class IndexEntry {
  private final StoreKey key;
  private final IndexValue value;

  IndexEntry(StoreKey key, IndexValue value) {
    this.key = key;
    this.value = value;
  }

  StoreKey getKey() {
    return this.key;
  }

  IndexValue getValue() {
    return this.value;
  }
}
