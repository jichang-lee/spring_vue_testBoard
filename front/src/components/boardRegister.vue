<template>
    <div class="container">
      <div class="row">
        <div class="col-md-8 offset-md-2 mt-4">
          <div class="card card-margin">
            <div class="card-body p-4">
              <h3 class="mb-4">게시글 작성</h3>
  
              <!-- 게시글 제목 입력 폼 -->
              <div class="mb-3">
                <label for="title" class="form-label">게시글 제목</label>
                <input type="text" class="form-control" id="title" v-model="title">
              </div>
  
              <!-- 게시글 내용 입력 폼 -->
              <div class="mb-3">
                <label for="content" class="form-label">내용</label>
                <textarea class="form-control" id="content" rows="6" v-model="content"></textarea>
              </div>
  
              <!-- 게시 버튼 -->
              <button class="btn btn-primary" @click="submitPost">게시</button>
            </div>
          </div>
        </div>
      </div>
    </div>
  </template>
  
  <script setup>
  import { ref } from 'vue';
  
  const title = ref('');
  const content = ref('');
  
  const submitPost = () => {
    // 게시 버튼 클릭 시 게시 데이터를 처리하는 로직을 추가하세요.
  };
  </script>


<style scoped>
    .card{
        margin-left: 100px;
    }

</style>