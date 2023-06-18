package dev.dulred.pmsbackend.controller;

import dev.dulred.pmsbackend.entity.Post;
import dev.dulred.pmsbackend.entity.PostByCon;
import dev.dulred.pmsbackend.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class PostController {
    @Resource
    PostService postService;
    @PostMapping("/addPost")
    public String addPost(@RequestBody Post post){
        return  postService.addPost(post);
    }

    @GetMapping("/getPost")
    public List<Post> getPost (){
        return postService.getPost();
    }
    @PostMapping("/getPostByPage")
    public Map<String,Object> getPostByPage(@RequestBody PostByCon postByCon){
        return postService.getPostByPage(postByCon);
    }

    @PostMapping("/getPostByCon")
    public Map<String,Object> getPostByCon(@RequestBody PostByCon postByCon){
        return postService.getPostByCon(postByCon);
    }
    @PostMapping("/deletePost")
    public String deletePost(int id){
        return postService.deletePost(id);
    }
    @PostMapping("/getPostDetail")
    public Post getPostDetail(int id){
        return postService.getPostDetail(id);
    }

    @PostMapping("/updatePost")
    public String updatePost (@RequestBody Post post)
    {
        return postService.updatePost(post);
    }

}
