<template>
    <div class="container">
      <div class="row">
        <div class="col-md-8 offset-md-2 mt-4">
          <div class="card card-margin search-form">
            <div class="card-body p-0">
                <div class="row">
                  <div class="col-lg-3 col-md-3 col-sm-12 p-0" >
                    <label for="search-type" hidden>검색 유형</label>
                    <select class="form-control">
                      <option>제목</option>
                      <option>본문</option>
                      <option>id</option>
                      <option>닉네임</option>
                      <option>해시태그</option>
                    </select>                    
                  </div>
                  <div class="col-lg-8 col-md-6 col-sm-12 p-0">
                    <label for="search-value" hidden>검색어</label>
                    <input type="text" placeholder="검색어..." class="form-control">
                  </div>
                </div>
            </div>
          </div>
        </div>
      </div>
  
      <div class="row">
        <table class="table" id="article-table">
          <thead>
          <tr>
            <th class="title col-6"><a>제목</a></th>
            <th class="hashtag col-2"><a>해시태그</a></th>
            <th class="user-id"><a>작성자</a></th>
            <th class="created-at"><a>작성일</a></th>
          </tr>
          </thead>
          <tbody>
          <tr v-for="(dataList, index) in list" :key="index">
            <td class="title"><a>{{ dataList.title }}</a></td>
            <td class="hashtag">{{ dataList.content }}</td>
            <td class="user-id">{{ dataList.id }}</td>
            <!-- <td class="created-at">
              <time>{{ article.createdAt }}</time>
            </td> -->
          </tr>
          </tbody>
        </table>
      </div>
    </div>
  </template>
  
  <script setup>
  import axios from 'axios';
  import { ref , onMounted} from 'vue';
  
     
    const list = ref([]);

 const fnGetList = () => {
  axios
    .get("/localhost:8099/api/board/list")
    .then((res) => {
      this.list = res.data;
    })
    .catch((err) => {
      if (err.message.indexOf('Network Error') > -1) {
        alert('네트워크가 원활하지 않습니다.\n잠시 후 다시 시도해주세요.');
      }
    });
};

    onMounted(() => {
      fnGetList();
    });

  </script>
  
  <style scoped>

  .container{
   /* margin-left : 150px; */
  }
            .search-form {
  width: 80%;
  margin: 0 auto;
  margin-top: 1rem;
}

.search-form input {
  height: 100%;
  background: transparent;
  border: 0;
  display: block;
  width: 100%;
  padding: 1rem;
  height: 100%;
  font-size: 1rem;
}

.search-form select {
  background: transparent;
  border: 0;
  padding: 1rem;
  height: 100%;
  font-size: 1rem;
}

.search-form select:focus {
  border: 0;
}

.search-form button {
  height: 100%;
  width: 100%;
  font-size: 1rem;
}

.search-form button svg {
  width: 24px;
  height: 24px;
}

.card-margin {
  margin-bottom: 2.5rem;
}

@media (min-width: 992px) {
  .col-lg-2 {
    flex: 0 0 16.66667%;
    max-width: 16.66667%;
  }
}

.card {
  border: 0;
  box-shadow: 0px 0px 10px 0px rgba(82, 63, 105, 0.1);
  -webkit-box-shadow: 0px 0px 10px 0px rgba(82, 63, 105, 0.1);
  -moz-box-shadow: 0px 0px 10px 0px rgba(82, 63, 105, 0.1);
  -ms-box-shadow: 0px 0px 10px 0px rgba(82, 63, 105, 0.1);
}

.card {
  position: relative;
  display: flex;
  flex-direction: column;
  min-width: 0;
  word-wrap: break-word;
  background-color: #ffffff;
  background-clip: border-box;
  border: 1px solid #e6e4e9;
  border-radius: 8px;
}
    

    
  </style>
  