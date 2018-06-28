package org.hello.controller;
 
import javax.inject.Inject;
 
import org.hello.domain.BoardVO;
import org.hello.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/board/") //url요청이  /board/로 시작하는 것은 여기서 처리한다. ex) board/abc , board/123 board/create
public class BoardController {
    
    @Inject
    private BoardService service;
    
    @RequestMapping(value="/create",method=RequestMethod.GET)
    public void createGET(BoardVO board, Model model) throws Exception{
        System.out.println(" /board/create 입니다. GET방식");
        
    }
    
    @RequestMapping(value = "/create",method=RequestMethod.POST )
    public String createPOST(BoardVO board, Model model) throws Exception{
        System.out.println("/board/create POST방식 입니다.");
        System.out.println(board.toString());
        
        service.create(board);
        model.addAttribute("result", "성공");
        
        return "/board/succes";
    }

}