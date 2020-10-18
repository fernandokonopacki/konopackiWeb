package br.com.sgc.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

import javax.inject.Inject;

@Controller
public class IndexController {

    private final Result result;

    /**
     * @deprecated CDI eyes only
     */
    protected IndexController() {
        this(null);
    }

    @Inject
    public IndexController(Result result) {
        this.result = result;
    }

    @Path("/")
    public void index() {
        result.include("variable", "VRaptor!");
    }
}